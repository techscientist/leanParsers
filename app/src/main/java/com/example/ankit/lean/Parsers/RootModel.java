import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String logo;
	public CreatorModel _creator;
	public String timezone;
	public String state;
	public String email;
	public String start_time;
	public int id;
	public String background_image;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String end_time;
	public CopyrightModel _copyright;
	public String name;
	public VersionModel _version;
	public String organizer_description;
	public String topic;
	public String code_of_conduct;
	public String privacy;
	public String schedule_published_on;
	public String location_name;

	public RootModel(ArrayList<Social_linksModel> social_links, String organizer_name, String logo, CreatorModel creator, String timezone, String state, String email, String start_time, int id, String background_image, String type, Call_for_papersModel call_for_papers, String description, String end_time, CopyrightModel copyright, String name, VersionModel version, String organizer_description, String topic, String code_of_conduct, String privacy, String schedule_published_on, String location_name) {

		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this._creator = creator;
		this.timezone = timezone;
		this.state = state;
		this.email = email;
		this.start_time = start_time;
		this.id = id;
		this.background_image = background_image;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.end_time = end_time;
		this._copyright = copyright;
		this.name = name;
		this._version = version;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;

	}

}