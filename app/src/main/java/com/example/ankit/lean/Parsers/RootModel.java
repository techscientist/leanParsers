import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String organizer_name;
	public String topic;
	public int id;
	public String start_time;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String privacy;
	public CreatorModel _creator;
	public String background_image;
	public String type;
	public String schedule_published_on;
	public String email;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String logo;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String location_name;
	public String state;

	public RootModel(String end_time, String organizer_name, String topic, int id, String start_time, String code_of_conduct, CopyrightModel copyright, String organizer_description, String privacy, CreatorModel creator, String background_image, String type, String schedule_published_on, String email, String name, Call_for_papersModel call_for_papers, String timezone, String logo, VersionModel version, ArrayList<Social_linksModel> social_links, String description, String location_name, String state) {

		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.id = id;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this._creator = creator;
		this.background_image = background_image;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.logo = logo;
		this._version = version;
		this.social_links = social_links;
		this.description = description;
		this.location_name = location_name;
		this.state = state;

	}

}