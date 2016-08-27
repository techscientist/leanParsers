import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String description;
	public String privacy;
	public String email;
	public String timezone;
	public String type;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String start_time;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String name;
	public String organizer_name;
	public String background_image;
	public int id;
	public String code_of_conduct;
	public String state;
	public VersionModel _version;
	public String logo;
	public String topic;
	public String end_time;

	public RootModel(ArrayList<Social_linksModel> social_links, String schedule_published_on, String description, String privacy, String email, String timezone, String type, String location_name, Call_for_papersModel call_for_papers, String organizer_description, String start_time, CopyrightModel copyright, CreatorModel creator, String name, String organizer_name, String background_image, int id, String code_of_conduct, String state, VersionModel version, String logo, String topic, String end_time) {

		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.privacy = privacy;
		this.email = email;
		this.timezone = timezone;
		this.type = type;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this._copyright = copyright;
		this._creator = creator;
		this.name = name;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._version = version;
		this.logo = logo;
		this.topic = topic;
		this.end_time = end_time;

	}

}