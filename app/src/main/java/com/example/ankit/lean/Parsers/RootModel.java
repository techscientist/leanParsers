import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public VersionModel _version;
	public int id;
	public String schedule_published_on;
	public String location_name;
	public String privacy;
	public String start_time;
	public String topic;
	public String organizer_description;
	public String state;
	public String type;
	public String end_time;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String name;
	public String logo;
	public String organizer_name;
	public String description;
	public String email;

	public RootModel(String code_of_conduct, Call_for_papersModel call_for_papers, String background_image, VersionModel version, int id, String schedule_published_on, String location_name, String privacy, String start_time, String topic, String organizer_description, String state, String type, String end_time, CopyrightModel copyright, CreatorModel creator, ArrayList<Social_linksModel> social_links, String timezone, String name, String logo, String organizer_name, String description, String email) {

		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this._version = version;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.privacy = privacy;
		this.start_time = start_time;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.state = state;
		this.type = type;
		this.end_time = end_time;
		this._copyright = copyright;
		this._creator = creator;
		this.social_links = social_links;
		this.timezone = timezone;
		this.name = name;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.description = description;
		this.email = email;

	}

}