import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String background_image;
	public int id;
	public String name;
	public String organizer_name;
	public String topic;
	public String end_time;
	public String schedule_published_on;
	public String code_of_conduct;
	public String logo;
	public CreatorModel _creator;
	public String organizer_description;
	public String timezone;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String description;
	public String privacy;
	public String start_time;
	public String email;

	public RootModel(CopyrightModel copyright, String background_image, int id, String name, String organizer_name, String topic, String end_time, String schedule_published_on, String code_of_conduct, String logo, CreatorModel creator, String organizer_description, String timezone, String location_name, ArrayList<Social_linksModel> social_links, String state, VersionModel version, Call_for_papersModel call_for_papers, String type, String description, String privacy, String start_time, String email) {

		this._copyright = copyright;
		this.background_image = background_image;
		this.id = id;
		this.name = name;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.location_name = location_name;
		this.social_links = social_links;
		this.state = state;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.description = description;
		this.privacy = privacy;
		this.start_time = start_time;
		this.email = email;

	}

}