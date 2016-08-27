import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String background_image;
	public int id;
	public String topic;
	public String type;
	public String email;
	public String description;
	public String start_time;
	public String location_name;
	public String privacy;
	public String logo;
	public CreatorModel _creator;
	public String name;
	public String organizer_description;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String state;
	public String timezone;
	public String schedule_published_on;
	public VersionModel _version;

	public RootModel(ArrayList<Social_linksModel> social_links, String organizer_name, String background_image, int id, String topic, String type, String email, String description, String start_time, String location_name, String privacy, String logo, CreatorModel creator, String name, String organizer_description, String end_time, Call_for_papersModel call_for_papers, CopyrightModel copyright, String code_of_conduct, String state, String timezone, String schedule_published_on, VersionModel version) {

		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.id = id;
		this.topic = topic;
		this.type = type;
		this.email = email;
		this.description = description;
		this.start_time = start_time;
		this.location_name = location_name;
		this.privacy = privacy;
		this.logo = logo;
		this._creator = creator;
		this.name = name;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this._version = version;

	}

}