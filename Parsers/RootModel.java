import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public int id;
	public String schedule_published_on;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String timezone;
	public String name;
	public String type;
	public String logo;
	public String state;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String end_time;
	public String location_name;
	public String background_image;
	public String topic;
	public CreatorModel _creator;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String privacy;
	public String email;

	public RootModel(String organizer_description, int id, String schedule_published_on, String organizer_name, CopyrightModel copyright, String timezone, String name, String type, String logo, String state, String code_of_conduct, Call_for_papersModel call_for_papers, VersionModel version, String end_time, String location_name, String background_image, String topic, CreatorModel creator, String description, ArrayList<Social_linksModel> social_links, String start_time, String privacy, String email) {

		this.organizer_description = organizer_description;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.timezone = timezone;
		this.name = name;
		this.type = type;
		this.logo = logo;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.end_time = end_time;
		this.location_name = location_name;
		this.background_image = background_image;
		this.topic = topic;
		this._creator = creator;
		this.description = description;
		this.social_links = social_links;
		this.start_time = start_time;
		this.privacy = privacy;
		this.email = email;

	}

}